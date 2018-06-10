/**
 * This class is the view model for the Main view of the application.
 */
Ext.define('News.view.main.MainModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.main',

    data: {
        name: I18n.get('app.name')
    },



});

Ext.onReady(function () {
    Ext.define("Ext.locale.pl.view.AbstractView", {
        override: "Ext.view.AbstractView",
        loadingText: I18n.get('app.loading')
    });
});
