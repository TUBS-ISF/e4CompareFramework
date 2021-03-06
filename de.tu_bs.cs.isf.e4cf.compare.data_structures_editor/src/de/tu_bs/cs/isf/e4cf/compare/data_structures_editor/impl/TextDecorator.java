package de.tu_bs.cs.isf.e4cf.compare.data_structures_editor.impl;

import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Node;
import de.tu_bs.cs.isf.e4cf.compare.data_structures.interfaces.Tree;
import de.tu_bs.cs.isf.e4cf.compare.data_structures_editor.interfaces.NodeDecorator;
import de.tu_bs.cs.isf.e4cf.compare.data_structures_editor.stringtable.FileTable;
import javafx.scene.control.TreeItem;
import javafx.scene.image.ImageView;

public class TextDecorator implements NodeDecorator {
	public TextDecorator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public TreeItem<Node> decorateNode(TreeItem<Node> node) {
		switch (node.getValue().getNodeType()) {
		case "WORD":
			node.setGraphic(new ImageView(FileTable.nodeImage));
			break;
		case "LINE":
			node.setGraphic(new ImageView(FileTable.lineImage));
			break;
		default:
			node.setGraphic(new ImageView(FileTable.defaultImage));
			break;
		}
		return node;
	}

	@Override
	public boolean isSupportedTree(Tree tree) {
		return tree.getFileExtension().equals("txt");
	}
	
	@Override
	public String toString() {
		return "Text Decorator";
	}
}
