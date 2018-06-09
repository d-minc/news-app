/**
 * This is the controller for the grid panel
 */
Ext.define('News.view.main.news.header.HeaderController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.header',

    id: 'headercontroller',

    /**
     * Country change listener
     */
    onCountryChange: function (combobox) {
        var newsStore = Ext.StoreManager.lookup('newsstore');
        newsStore.setLangProxyParameter(combobox.value);
        newsStore.reloadStoreWithParameters();
    }
});
