Ext.define('News.view.main.news.NewsPanel', {
    extend: 'Ext.panel.Panel',
    xtype: 'newspanel',

    requires: [
        'News.view.main.news.gridpanel.NewsGridPanel',
        'News.view.main.news.footer.NewsFooter'
    ],

    id: 'newspanel',

    layout: {
        type:'vbox',
        align: 'stretch',
        padding: 10
    },

    items: [
        {
            xtype: 'newsgridpanel',
            flex: 3
        },
        {
            xtype: 'newsfooter',
            flex: 1
        }]

});