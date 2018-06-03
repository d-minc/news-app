Ext.define('News.view.main.news.gridpanel.grid.NewsGrid', {
    extend: 'Ext.grid.Panel',
    xtype: 'newsgrid',

    requires: [
        'News.I18n',
        'News.store.NewsStore',
        'News.view.main.news.gridpanel.grid.GridController',
        'News.view.main.news.gridpanel.components.countrycombobox.CountryStore',
        'Ext.grid.*',
        'Ext.data.*',
        'Ext.util.*',
        'Ext.state.*',
        'Ext.form.*',
        'Ext.panel.*'
    ],

    plugins: {
        ptype: 'cellediting',
        clicksToEdit: 1
    },

    buttonAlign: 'start',

    title: I18n.get('newsgrid.title'),

    store: {
        type: 'newsstore'
    },

    controller: 'grid',

    layout: 'fit',

    columns: [
        {
            text: I18n.get('newsgrid.column.country'),
            dataIndex: 'country',
            type: 'string',
            flex: 1,
        },
        {
            text: I18n.get('newsgrid.column.category'),
            dataIndex: 'category',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.author'),
            dataIndex: 'author',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.title'),
            dataIndex: 'title',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.description'),
            dataIndex: 'description',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.date'),
            dataIndex: 'date',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.sourceName'),
            dataIndex: 'sourceName',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.articleUrl'),
            dataIndex: 'articleUrl',
            type: 'string',
            flex: 1
        },
        {
            text: I18n.get('newsgrid.column.imageUrl'),
            dataIndex: 'imageUrl',
            type: 'string',
            flex: 1
        }
    ]
});
