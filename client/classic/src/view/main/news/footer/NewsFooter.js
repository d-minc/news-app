Ext.define('News.view.main.news.footer.NewsFooter', {
    extend: 'Ext.panel.Panel',
    xtype: 'newsfooter',

    controller: 'footer',

    requires: [
        'News.I18n',
        'Ext.button.*',
        'News.view.main.news.footer.FooterController'
    ],

    layout: {
        type: 'hbox',
        align: 'begin',
        pack: 'center',
        padding: 10
    },

    items: [{
        xtype: 'button',
        text: I18n.get('newsgrid.button.refresh'),
        listeners: {
            click: 'onRefreshClick'
        }
    }]

});