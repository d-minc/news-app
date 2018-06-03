/**
 * This is the controller for the news grid.
 */
Ext.define('News.view.main.news.gridpanel.grid.GridController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.grid',

    requires: [
        'News.store.NewsStore'
    ],

    config: {
        stores: ['newsstore']
    },

});
