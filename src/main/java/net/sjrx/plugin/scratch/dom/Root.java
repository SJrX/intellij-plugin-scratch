/*
 * Copyright (c) Elastic Path Software Inc., 2019
 */
package net.sjrx.plugin.scratch.dom;

import java.util.List;

import com.intellij.util.xml.Convert;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericDomValue;
import com.intellij.util.xml.NameValue;
import com.intellij.util.xml.Resolve;
import com.intellij.util.xml.SubTag;
import com.intellij.util.xml.SubTagList;
import com.intellij.util.xml.impl.GenericDomValueReference;

public interface Root extends DomElement {

	@SubTagList("obj")
	List<Obj> getObj();

	@SubTagList("ref")
	List<Ref> getRef();
}

