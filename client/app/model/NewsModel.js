Ext.define('News.model.NewsModel', {
    extend: 'News.model.Base',

    fields: [
        {name: 'author', type: 'string', mapping: 'articles.author'},
        {name: 'title', type: 'string', mapping: 'articles.title'},
        {name: 'description', type: 'string', mapping: 'articles.description'},
        {name: 'date', type: 'date', mapping: 'articles.date'},
        {name: 'sourceName', type: 'string', mapping: 'articles.sourceName'},
        {name: 'articleUrl', type: 'string', mapping: 'articles.articleUrl'},
        {name: 'imageUrl', type: 'string', mapping: 'articles.imageUrl'}
    ]
});
