Ext.define('News.view.main.news.gridpanel.components.countrycombobox.CountryStore', {
    extend: 'Ext.data.Store',

    alias: 'store.country',

    requires: [
        'News.model.CountryModel'
    ],

    model: 'News.model.CountryModel',

    data: [
        {country: 'pl'},
        {country: 'us'},
        {country: 'gb'},
        {country: 'de'}
    ]

});