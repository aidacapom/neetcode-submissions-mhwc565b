class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*
            - SOLUCION Streams (Arrays.stream().distinct().count())

            Time: O(n) — recorre todo el array siempre
            Space: O(n) — distinct() internamente usa un HashSet para rastrear los elementos únicos

            - SOLUCION HashMap

            Time: O(n) — en el peor caso recorre todo, pero puede salir antes con early return
            Space: O(n) — almacena hasta n entradas en el mapa

            - SOLUCION HashSet

            Time: O(n) — igual que HashMap, con early return
            Space: O(n) — almacena hasta n elementos

            Las tres son O(n) en tiempo y espacio, pero la diferencia práctica está en las constantes:

            Streams siempre procesa los n elementos y tiene el overhead del pipeline de streams
            HashMap guarda pares key-value innecesariamente, usando más memoria por entrada que un Set
            HashSet es el más ligero en memoria por entrada y sale en cuanto encuentra el duplicado
        */

        Set<Integer> seen = new HashSet<>();

        for(int num: nums) {
            if(!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}