/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting causes an instance of this class to be created and
 * added to the Viewport container.
 */
Ext.define('News.view.main.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'app-main',

    requires: [
        'News.I18n',
        'Ext.MessageBox',
        'Ext.layout.Fit'
    ],

    controller: 'main',
    viewModel: 'main',

    defaults: {
        tab: {
            iconAlign: 'top'
        }
    },

    tabBarPosition: 'bottom',

    items: [
        {
            title: I18n.get('app.tab.main'),
            iconCls: 'x-fa fa-home',
            layout: 'fit',
        },{
            title: I18n.get('app.tab.about'),
            iconCls: 'x-fa fa-about',
            bind: {
                html: I18n.get('app.about')
            }
        }
    ]
});
