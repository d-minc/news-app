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

    loadingMask: null,

    init: function () {
        this.listen({
            store: {
                'newsstore': {
                    beforeload: 'onBeforeStoreLoad',
                    load: 'onStoreLoad'
                }
            }
        });
    },

    onBeforeStoreLoad: function () {
        this.loadingMask = new Ext.LoadMask({
            msg: I18n.get('app.loading'),
            target: Ext.getCmp('newspanel')
        });
        this.loadingMask.show();
    },

    onStoreLoad: function (store, records) {
        this.loadingMask.hide();
    }

});
