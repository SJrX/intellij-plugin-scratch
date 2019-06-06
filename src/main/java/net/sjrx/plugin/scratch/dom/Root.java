/*
 * Copyright (c) Elastic Path Software Inc., 2019
 */
package net.sjrx.plugin.scratch.dom;

import java.util.List;

import com.intellij.util.xml.DomElement;

public interface Root extends DomElement {
	List<Obj> getObjects();

	List<Ref> getRefs();
}

