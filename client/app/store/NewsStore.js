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

    proxyParameters: {
        lang: 'pl',
        category: 'business'
    },

    proxy: {
        type: 'ajax',
        reader: {
            type: 'json',
            rootProperty: 'articles'
        },
        url: '/news/pl/business',
        messageProperty: 'message',
        listeners: {
            exception: function (proxy, response, operation, eOpts) {
                var responseText = Ext.decode(response.responseText);
                Ext.Msg.alert(I18n.get('newsgrid.error.newsapi'), responseText.message, Ext.emptyFn);
            }
        }
    },

    autoLoad: true,

    /**
     * Updates the url path params (Ext do not have built-in functionality for path parameters)
     * @param lang
     * @param category
     */
    reloadStoreWithParameters: function () {
        var url = '/news/' + this.proxyParameters.lang + '/' + this.proxyParameters.category;
        this.proxy.url = url;
        this.reload();
    },

    setLangProxyParameter: function (lang) {
        this.proxyParameters.lang = lang;
    },

    setCategoryProxyParameter: function (category) {
        this.proxyParameters.category = category;
    }

});
