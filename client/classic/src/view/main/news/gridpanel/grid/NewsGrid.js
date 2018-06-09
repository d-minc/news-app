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

    buttonAlign: 'start',

    title: I18n.get('newsgrid.title'),

    store: {
        type: 'newsstore'
    },

    plugins: 'gridfilters',

    controller: 'grid',

    layout: 'fit',

    height: 600,

    columns: [
        {
            text: I18n.get('newsgrid.column.imageUrl'),
            dataIndex: 'imageUrl',
            type: 'string',
            flex: 2,
            renderer: function (imgSrc) {
                return '<img src="' + imgSrc + '" alt="' + I18n.get('newsgrid.image') + '" >';
            }
        },
        {
            text: I18n.get('newsgrid.column.title'),
            dataIndex: 'title',
            type: 'string',
            flex: 4,
            filter: {
                type: 'string'
            }
        },
        {
            text: I18n.get('newsgrid.column.description'),
            dataIndex: 'description',
            type: 'string',
            flex: 6,
            filter: {
                type: 'string'
            }
        },
        {
            text: I18n.get('newsgrid.column.sourceName'),
            dataIndex: 'sourceName',
            type: 'string',
            flex: 2,
            filter: {
                type: 'string'
            }
        },
        {
            text: I18n.get('newsgrid.column.author'),
            dataIndex: 'author',
            type: 'string',
            flex: 2,
            filter: {
                type: 'string'
            }
        },
        {
            text: I18n.get('newsgrid.column.date'),
            dataIndex: 'date',
            type: 'date',
            flex: 2,
            renderer: Ext.util.Format.dateRenderer('Y-m-d'),
            filter: {
                type: 'date'
            }
        },
        {
            text: I18n.get('newsgrid.column.articleUrl'),
            dataIndex: 'articleUrl',
            type: 'string',
            flex: 1,
            renderer: function (url) {
                return '<a href="' + url + '">[' + I18n.get('newsgrid.column.articleUrl') + ']</a>';
            }
        }
    ]
});
