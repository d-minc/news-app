/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'News.Application',

    name: 'News',

    requires: [
        // This will automatically load all classes in the News namespace
        // so that application classes do not need to require each other.
        'News.*'
    ],

    // The name of the initial view to create.
    mainView: 'News.view.main.Main'
});
