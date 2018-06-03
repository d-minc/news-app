Ext.define('News.view.main.news.gridpanel.components.countrycombobox.CountryStore', {
    extend: 'Ext.data.Store',

    alias: 'store.country',

    model: 'News.model.CountryModel',

    proxy: {
        type: 'ajax',
        url: '/countries',
        reader: {
            type: 'json'
        }
    },
    autoLoad: true

});
