    class SqueakyClean {
        static String clean(String identifier) {
            StringBuilder cleanString = new StringBuilder();
            for (char character : identifier.toCharArray()) {
                String string = String.valueOf(character);
                if (string.matches("[^a-zA-Z0-9 -]")) {
                    string = string.replace(string, "");
                }
                if (string.matches("[0-9]")) {
                    string = string.replace("0", "o")
                            .replace("1", "l")
                            .replace("3", "e")
                            .replace("4", "a")
                            .replace("7", "t");
                }
                if (string.matches(" ")) {
                    string = string.replace(string, "_");
                }
                cleanString.append(string);
            }
            String[] words = cleanString.toString().split("-");
            StringBuilder camelCase = new StringBuilder(words[0]);
            for (int i = 1; i < words.length; i++) {
                String word = words[i];
                camelCase.append(word.substring(0, 1).toUpperCase());
                camelCase.append(word.substring(1));
            }
            return camelCase.toString();
        }
    }
