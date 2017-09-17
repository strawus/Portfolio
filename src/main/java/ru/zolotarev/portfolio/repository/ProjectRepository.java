package ru.zolotarev.portfolio.repository;

import com.salimov.yurii.entity.Project;

/**
 * The interface provides a set of JPA methods for working
 * {@link Project} objects with a database.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 * @see DataRepository
 * @see Project
 */
public interface ProjectRepository extends DataRepository<Project> {

    /**
     * Returns article from a database,
     * which matches the parameter url.
     *
     * @param url a title of the article to return.
     * @return The object of class {@link Project}.
     * @see Project
     */
    Project findByUrl(final String url);

    /**
     * Removes article from a database,
     * which matches the parameter url.
     *
     * @param url a url of the article to remove.
     * @see Project
     */
    void deleteByUrl(final String url);
}