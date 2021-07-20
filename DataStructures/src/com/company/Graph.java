package com.company;

import java.util.ArrayList;

class AdjacencyListGraph<E extends Comparable<E>>{

    ArrayList<Vertex> verticies;

    public AdjacencyListGraph(){
        verticies = new ArrayList<>();
    }

    private class Vertex {
        E data;
        ArrayList<Vertex> adjencencyVerticies;

        public Vertex(E data){
            adjencencyVerticies = new ArrayList<>();
            this.data = data;
        }

        public boolean addAdjacentVertex(Vertex to){
            for(Vertex v : adjencencyVerticies){
                if(v.data.compareTo(to.data) == 0){
                    return false;
                }
            }
            return adjencencyVerticies.add(to);
        }

        public boolean removeAdjacentVertex(E to){

            for(int i = 0; i < adjencencyVerticies.size(); i++){
                if(adjencencyVerticies.get(i).data.compareTo(to) == 0){
                    adjencencyVerticies.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeEdge(E from, E to){
        Vertex fromV = null;
        for(Vertex v : verticies){
            if(from.compareTo(v.data) == 0){
                fromV = v;
                break;
            }
        }
        if(fromV == null)
            return false;

        return fromV.removeAdjacentVertex(to);
    }

    public boolean addEdge(E from, E to){
        Vertex fromV = null, toV = null;

        for(Vertex v : verticies){
            if(from.compareTo(v.data) == 0){
                fromV = v;
            }else if(to.compareTo(v.data)==0){
                toV = v;
            }

            if(fromV != null && toV != null)
                break;
        }
        if(fromV == null){
            fromV = new Vertex(from);
            verticies.add(fromV);
        }

        if(toV == null){
            toV = new Vertex(to);
            verticies.add(toV);
        }

        return fromV.addAdjacentVertex(toV);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Vertex v : verticies){
            sb.append("Vertex: ");
            sb.append(v.data);
            sb.append("\n");
            sb.append("Adjacent vertices ");
            for(Vertex v2 : v.adjencencyVerticies){
                sb.append(v2.data);
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}
