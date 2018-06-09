/**
 * This is the controller for the grid panel
 */
Ext.define('News.view.main.news.footer.FooterController', {
    extend: 'Ext.app.ViewController',

    alias: 'controller.footer',

    id: 'footercontroller',

    /**
     * Refresh click listener
     */
    onRefreshClick: function (button) {
        var newsStore = Ext.StoreManager.lookup('newsstore');
        newsStore.reload();
    }
});
