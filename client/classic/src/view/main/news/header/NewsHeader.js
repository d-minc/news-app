Ext.define('News.view.main.news.header.NewsHeader', {
    extend: 'Ext.panel.Panel',
    xtype: 'newsheader',

    controller: 'header',

    requires: [
        'News.I18n',
        'Ext.button.*',
        'News.view.main.news.header.HeaderController'
    ],

    layout: {
        type: 'hbox',
        align: 'begin',
        pack: 'center',
        padding: 10
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
    }]

    // editor: {
    //     xtype : 'combobox',
    //     id : 'countryCodeCombobox',
    //     store : Ext.create('IncomeCalculator.view.main.salary.gridpanel.components.countrycombobox.CountryStore'),
    //     displayField : 'countryCode',
    //     valueField : 'countryCode',
    //     editable: false,
    //     mode : 'local'

});