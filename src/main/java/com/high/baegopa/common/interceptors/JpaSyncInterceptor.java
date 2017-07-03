package com.high.baegopa.common.interceptors;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;
import org.joda.time.LocalDateTime;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by high on 2017. 7. 2..
 */
@Slf4j
public class JpaSyncInterceptor extends EmptyInterceptor implements ApplicationContextAware, Serializable {
    private static final long serialVersionUID = -4905755656754047400L;

    private static JpaSyncInterceptor instance;

    private JpaSyncInterceptor() {
        log.info("Initializing the synchronization master interceptor");
    }

    public static JpaSyncInterceptor getInstance() {
        if (instance == null) {
            instance = new JpaSyncInterceptor();
        }
        return instance;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        // NOT ACTION
    }

    @Override
    public void afterTransactionBegin(Transaction tx) {
        log.info("[MASTER] master db transaction start.");
    }

    @Override
    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        // NOT ACTION
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        boolean isPropertyChanged = false;

        int indexCreatedAt = ArrayUtils.indexOf(propertyNames, "createdAt");
        if (indexCreatedAt != ArrayUtils.INDEX_NOT_FOUND) {
            if (state[indexCreatedAt] == null) {
                state[indexCreatedAt] = LocalDateTime.now();
                isPropertyChanged = true;
            }
        }

        int indexUpdatedAt = ArrayUtils.indexOf(propertyNames, "updatedAt");
        if (indexUpdatedAt != ArrayUtils.INDEX_NOT_FOUND) {
            if (state[indexUpdatedAt] == null) {
                state[indexUpdatedAt] = LocalDateTime.now();
                isPropertyChanged = true;
            }
        }

        return isPropertyChanged;
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        boolean isPropertyChanged = false;

        int indexUpdatedAt = ArrayUtils.indexOf(propertyNames, "updatedAt");
        if (indexUpdatedAt != ArrayUtils.INDEX_NOT_FOUND) {
            if (currentState[indexUpdatedAt] == null) {
                currentState[indexUpdatedAt] = LocalDateTime.now();
                isPropertyChanged = true;
            }
        }

        return isPropertyChanged;
    }

    @Override
    public void onCollectionRemove(Object collection, Serializable key) throws CallbackException {
        // NOT ACTION
    }

    @Override
    public void onCollectionRecreate(Object collection, Serializable key) throws CallbackException {
        // NOT ACTION
    }

    @Override
    public void onCollectionUpdate(Object collection, Serializable key) throws CallbackException {
        // NOT ACTION
    }

    @Override
    public String onPrepareStatement(String sql) {
        log.info("[MASTER] sql : {}", sql);
        return sql;
    }

    @Override
    public void preFlush(@SuppressWarnings("rawtypes") Iterator entities) {
        // NOT ACTION
    }

    @Override
    public void postFlush(@SuppressWarnings("rawtypes") Iterator entities) {
        // NOT ACTION
    }

    @Override
    public void beforeTransactionCompletion(Transaction tx) {
        // NOT ACTION
    }

    @Override
    public void afterTransactionCompletion(Transaction tx) {
        log.info("[MASTER] master db transaction end.");
    }
}
