Ext.define('News.view.main.news.gridpanel.components.categorycombobox.CategoryStore', {
    extend: 'Ext.data.Store',

    alias: 'store.category',

    requires: [
        'News.view.main.news.gridpanel.components.categorycombobox.CategoryModel'
    ],

    model: 'News.view.main.news.gridpanel.components.categorycombobox.CategoryModel',

    data: [
        {category: 'business'},
        {category: 'entertainment'},
        {category: 'general'},
        {category: 'health'},
        {category: 'science'},
        {category: 'sports'},
        {category: 'technology'}
    ]

});