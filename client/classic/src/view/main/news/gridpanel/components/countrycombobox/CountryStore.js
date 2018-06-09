Ext.define('News.view.main.news.gridpanel.components.countrycombobox.CountryStore', {
    extend: 'Ext.data.Store',

    alias: 'store.country',

    requires: [
        'News.view.main.news.gridpanel.components.countrycombobox.CountryModel'
    ],

    model: 'News.view.main.news.gridpanel.components.countrycombobox.CountryModel',

    data: [
        {country: 'pl'},
        {country: 'us'},
        {country: 'gb'},
        {country: 'de'}
    ]

});