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
        // var loadingMask = new Ext.LoadMask({
        //     msg    : I18n.get('app.loading'),
        //     target : Ext.getCmp('newspanel')
        // });
        // loadingMask.show();
        var newsStore = Ext.StoreManager.lookup('newsstore');
        //TODO: dominc, reload store
    }
});
