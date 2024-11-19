public  class TextAnalyser {
            // Räknar antalet rader
            private int rows = 0;
            // Räknar antalet tecken
            private int characters = 0;
            // Räknar antalet ord
            private int words = 0;
            // Håller koll på det längsta ordet
            private String longestWord = "";

            // Metod för att analysera en rad och uppdatera räkningen av rader, tecken och ord
            public void analyse(String text) {
                // Öka antalet rader med 1
                rows++;
                // Lägg till antalet tecken i texten
                characters += text.length();

                // Dela upp texten i ord och räkna dem
                String[] wordArray = text.split("\\s+"); // Dela upp texten vid mellanslag
                words += wordArray.length; // Uppdatera antalet ord

                // Hitta det längsta ordet i texten
                for (String word : wordArray) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            // Metod för att hämta antalet rader
            public int getRows() {
                return rows;
            }

            // Metod för att hämta antalet tecken
            public int getCharacters() {
                return characters;
            }

            // Metod för att hämta antalet ord
            public int getWords() {
                return words;
            }

            // Metod för att hämta det längsta ordet
            public String getLongestWord() {
                return longestWord;
            }


}
