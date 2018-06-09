// NOSONAR This is a large file "by design" and should not generate warnings about the file being too long.
// retrieve language from url parameter lang=pl|en
var langCode;
langCode = Ext.Object.fromQueryString(window.location.search).lang;
if (!langCode) {
    langCode = 'pl';
}

/**
 * Class holds all translations of GUI labels.
 * Translations can be retrieved via the get method.
 * Usage:  I18n.get('employee.grid.button.addEmployee');
 */
Ext.define('News.I18n', {
    xtype: 'I18n',
    alternateClassName: 'I18n',

    singleton: true,

    constructor: function () {
        this.languageCode = langCode;
    },

    newsgrid: {
        title: {pl: 'Najnowsze wiadomości'},
        column: {
            country: {pl: 'Kraj'},
            category: {pl: 'Kategoria'},
            author: {pl: 'Autor'},
            title: {pl: 'Tytuł'},
            date: {pl: 'Data'},
            sourceName: {pl: 'Źródło'},
            articleUrl: {pl: 'Link'},
            imageUrl: {pl: ' '},
            description: {pl: 'Opis'}
        },

        button: {
            refresh: {pl: 'Odśwież'}
        },

        error: {
            maxRecords: {pl: 'Nie można dodać więcej rekordów'},
            update: {pl: 'Błąd aktualizacji danych'},
            timedout: {pl: 'Przekroczono limit czasu żądania'},
            newsapi: {pl: 'Błąd serwisu zewnętrznego Newsapi'}
        }
    },
    app: {
        name: {pl: 'Wiadomości ze świata'},
        about: {pl: 'Dostęp do najnowszych wiadomości z całego świata.'},
        newsapi: {pl: 'Powered by News API'},
        tab: {
            about: {pl: 'O aplikacji'},
            main: {pl: 'Strona główna'}
        },
        loading: {pl: 'Ładowanie...'}
    },



    /*
     *  Returns the translated string for the given key.
     *  If no translation is found the key prefixed with "!" is returned and a warning is logged.
     */
    get: function (key) {
        var keys = key.split('.'),
            result = this;

        for (var i = 0; i < keys.length; i++) {
            result = result[keys[i]];
            if (!result) {
                console.warn('Key not translated:' + key);
                return '!' + key;
            }
        }

        if (result[this.languageCode]) {
            return result[this.languageCode];
        } else if (result['pl']) {
            // fallback to german
            return result['pl'];
        } else {
            console.warn('key not translated:' + key + ',' + this.languageCode);
            return '!' + key;
        }
    },
    /**
     * This method does the same as "get", but it provides also the possibility to replace
     * placeholders like {0}, {1}, etc. with further method parameters.
     * Example:
     *      if I18n.get('Sample.Text') would return 'Hello {0}, it's {1}!'
     *      then I18n.format('Sample.Text', 'Goofy', 'Monday') will return 'Hello Goofy, it's Monday!'
     * @param key The key which defines the I18n text.
     * @param arguments Arguments array for replacement.
     * @returns The associated text including the replaced placeholders.
     */
    format: function (key, params) {
        // Get at first the raw translation:
        var value = this.get(key);

        // Replace now possibly existing parameters {0} to {n}
        // Note: Since 'arguments' contains ALL method arguments (even 'key'!), we must start
        // this loop with i = 1!
        for (var i = 1; i < params.length; i++) {
            // The placeholders, however, start with 0, so use (i-1) here
            //                           vvvvv
            value = value.replace('{' + (i - 1) + '}', params[i]);
        }

        return value;
    }
});
//NOSONAR This is a large file "by design" and should not generate warnings about the file being too long.
