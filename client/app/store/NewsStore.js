/**
 * Store for salaries. This store usage could be changed to use the proxy
 * and send the whole record to the server - it would easier the store update,
 * but it will increase the amount of sent data (unneeded data)
 */
Ext.define('News.store.NewsStore', {
    extend: 'Ext.data.Store',

    alias: 'store.newsstore',

    requires: [
        'News.I18n',
        'News.model.NewsModel'
    ],

    model: 'News.model.NewsModel',

    storeId: 'newsstore',

    proxy: {
        type: 'ajax',
        reader: {
            type: 'json',
            rootProperty: 'articles'
        },
        // url: '/news/{lang}/{category}',
        //TODO: dominc, change to dynamic parameters
        url: '/news/us/business',
        messageProperty: 'message',
        listeners: {
            exception: function (proxy, response, operation, eOpts) {
                var responseText = Ext.decode(response.responseText);
                Ext.Msg.alert(I18n.get('newsgrid.error.newsapi'), responseText.message, Ext.emptyFn);
            }
        }
        // ,
        // extraParams: {
        //     lang: 'pl',//TODO: dominc, read from dropdown
        //     category: 'business'//TODO: dominc, read from dropdown
        // }
    },

    autoLoad: true

});
