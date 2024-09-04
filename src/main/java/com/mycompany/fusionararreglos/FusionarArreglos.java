/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fusionararreglos;

import java.util.Arrays;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class FusionarArreglos {
      public static int[] mergeAndSort(int[] nums1, int[] nums2) {
        // Crear un nuevo arreglo para contener ambos arreglos
        int[] result = new int[nums1.length + nums2.length];
        
        // Índices para recorrer ambos arreglos
        int i = 0, j = 0, k = 0;
        
        // Combinar ambos arreglos mientras queden elementos en ambos
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        
        // Si quedan elementos en nums1
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        
        // Si quedan elementos en nums2
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] result = mergeAndSort(nums1, nums2);
        System.out.println(Arrays.toString(result));  // Salida: [1, 2, 3, 4, 5, 6]
    }
}
