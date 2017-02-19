package com.danigu.blog.common.service;

/**
 * Interface for two-way transformer.
 * @param <E> Entity
 * @param <D> DTO
 */
public interface Transformer<E, D> {
    E fromEntity(D from);
    D toEntity(E from);
}
