Ext.define('News.view.main.news.gridpanel.NewsGridPanel', {
    extend: 'Ext.panel.Panel',
    xtype: 'newsgridpanel',

    requires: [
        'News.I18n',
        'News.view.main.news.gridpanel.grid.NewsGrid',
        'News.view.main.news.gridpanel.GridPanelController'
    ],

    controller: 'gridpanel',

    layout: 'fit',

    items: [{
        layout: {
            type: 'vbox',
            align: 'left',
            padding: 10
        },
        items: [{
            xtype: 'newsgrid',
            reference: 'newsgrid',
            width: '100%',
            region: 'center',
            flex: 3
        }]
    }]
});