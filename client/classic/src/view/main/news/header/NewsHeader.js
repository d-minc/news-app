Ext.define('News.view.main.news.header.NewsHeader', {
    extend: 'Ext.panel.Panel',
    xtype: 'newsheader',

    controller: 'header',

    requires: [
        'News.I18n',
        'News.view.main.news.gridpanel.components.categorycombobox.CategoryStore',
        'News.view.main.news.gridpanel.components.countrycombobox.CountryStore',
        'News.view.main.news.header.HeaderController'
    ],

    layout: {
        type: 'hbox',
        align: 'begin',
        pack: 'center'
    },
    defaults: {
        padding: 10,
        margin: 10
    },

    items: [{
        xtype: 'combobox',
        id: 'countryCodeCombobox',
        store: Ext.create('News.view.main.news.gridpanel.components.countrycombobox.CountryStore'),
        displayField: 'country',
        valueField: 'country',
        editable: false,
        mode: 'local',
        value: 'pl',
        fieldLabel: I18n.get('newsgrid.combobox.country'),
        listeners: {
            change: 'onCountryChange'
        }
    }, {
        xtype: 'combobox',
        id: 'categoryCombobox',
        store: Ext.create('News.view.main.news.gridpanel.components.categorycombobox.CategoryStore'),
        displayField: 'category',
        valueField: 'category',
        editable: false,
        mode: 'local',
        value: 'business',
        fieldLabel: I18n.get('newsgrid.combobox.category'),
        listeners: {
            change: 'onCategoryChange'
        }
    }]

});