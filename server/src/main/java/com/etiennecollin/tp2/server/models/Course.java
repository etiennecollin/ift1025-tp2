/*
 * Copyright (c) 2023. Etienne Collin #20237904
 */

package com.etiennecollin.tp2.server.models;

import java.io.Serializable;

/**
 * The Course class represents a course in the academic system.
 * <p>
 * It contains the name, code and semester of the course.
 */
public class Course implements Serializable {
    /**
     * The name of the course.
     */
    private String name;
    /**
     * The code of the course.
     */
    private String code;
    /**
     * The semester of the course.
     */
    private String semester;

    /**
     * Creates a new Course object with the specified name, code and semester.
     *
     * @param name     The name of the course.
     * @param code     The code of the course.
     * @param semester The semester of the course.
     */
    public Course(String name, String code, String semester) {
        this.name = name;
        this.code = code;
        this.semester = semester;
    }

    /**
     * Returns the name of the course.
     *
     * @return The name of the course.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the course.
     *
     * @param name The name of the course.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the code of the course.
     *
     * @return The code of the course.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code of the course.
     *
     * @param code The code of the course.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the semester of the course.
     *
     * @return The semester of the course.
     */
    public String getSemester() {
        return semester;
    }

    /**
     * Sets the semester of the course.
     *
     * @param semester The semester of the course.
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * Returns a string representation of the course.
     *
     * @return A string representation of the course.
     */
    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", code=" + code + ", semester=" + semester + '}';
    }
}
