/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.io.File;
import java.util.ArrayList;


/**
 * Esta clase guarda toda la información obtenida del archivo .tsp
 * @author JavierAros
 */
public class FileTSP {
    private String name;
    private String type;
    private String comment;
    private String dimension;
    private String edgeWeightType;
    private String edgeWeightFormat;
    private String displayDataType;
    private int[][] edgEweighTsection;
    private ArrayList<Nodo> displayDataSelection;
    /**
     * Constructor para guardar la informacion
     * @param archivo El parámetro archivo es el fichero .tsp
     */
    public FileTSP(File archivo){
        //sugerencia StringTokenizer
    }
}
