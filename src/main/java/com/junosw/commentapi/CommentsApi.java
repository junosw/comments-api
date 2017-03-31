package com.junosw.commentapi;

import org.springframework.boot.SpringApplication;

/**
 *
 */
public final class CommentsApi {

    /**
     * Don't allow creation of entry point object
     */
    private CommentsApi() { }

    /**
     * Main application entry point
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        // start spring application
        SpringApplication.run(CommentsController.class, args);
    }
}
