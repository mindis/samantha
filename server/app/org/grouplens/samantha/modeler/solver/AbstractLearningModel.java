package org.grouplens.samantha.modeler.solver;

import org.apache.commons.math3.linear.RealVector;

import org.grouplens.samantha.modeler.space.IndexSpace;
import org.grouplens.samantha.modeler.space.VariableSpace;

import java.util.List;

abstract public class AbstractLearningModel implements LearningModel {
    private static final long serialVersionUID = -6351993624488627527L;

    final protected VariableSpace variableSpace;
    final protected IndexSpace indexSpace;

    protected AbstractLearningModel(IndexSpace indexSpace, VariableSpace variableSpace) {
        this.variableSpace = variableSpace;
        this.indexSpace = indexSpace;
    }

    public void publishModel() {
        indexSpace.publishSpaceVersion();
        variableSpace.publishSpaceVersion();
    }

    public RealVector getScalarVarByName(String name) {
        return variableSpace.getScalarVarByName(name);
    }

    public int getScalarVarSizeByName(String name) {
        return variableSpace.getScalarVarSizeByName(name);
    }

    public void setScalarVarByName(String name, RealVector vars) {
        variableSpace.setScalarVarByName(name, vars);
    }

    public double getScalarVarByNameIndex(String name, int index) {
        return variableSpace.getScalarVarByNameIndex(name, index);
    }

    public void setScalarVarByNameIndex(String name, int index, double var) {
        variableSpace.setScalarVarByNameIndex(name, index, var);
    }

    public List<RealVector> getVectorVarByName(String name) {
        return variableSpace.getVectorVarByName(name);
    }

    public int getVectorVarSizeByName(String name) {
        return variableSpace.getVectorVarSizeByName(name);
    }

    public int getVectorVarDimensionByName(String name) {
        return variableSpace.getVectorVarDimensionByName(name);
    }

    public RealVector getVectorVarByNameIndex(String name, int index) {
        return variableSpace.getVectorVarByNameIndex(name, index);
    }

    public void setVectorVarByNameIndex(String name, int index, RealVector var) {
        variableSpace.setVectorVarByNameIndex(name, index, var);
    }

    public List<String> getAllScalarVarNames() {
        return variableSpace.getAllScalarVarNames();
    }

    public List<String> getAllVectorVarNames() {
        return variableSpace.getAllVectorVarNames();
    }

    public int getIndexForKey(String name, Object key) {
        return indexSpace.getIndexForKey(name, key);
    }

    public int getKeyMapSize(String name) {
        return indexSpace.getKeyMapSize(name);
    }
    public Object getKeyForIndex(String name, int index) {
        return indexSpace.getKeyForIndex(name, index);
    }

    public boolean containsKey(String name, Object key) {
        return indexSpace.containsKey(name, key);
    }
}
