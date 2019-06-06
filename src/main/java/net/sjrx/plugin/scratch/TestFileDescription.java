/*
 * Copyright (c) Elastic Path Software Inc., 2019
 */
package net.sjrx.plugin.scratch;

import javax.swing.*;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.DomFileDescription;
import com.intellij.util.xml.DomManager;
import com.intellij.util.xml.DomUtil;
import com.intellij.util.xml.GenericDomValue;
import net.sjrx.plugin.scratch.dom.Root;
import org.jetbrains.annotations.NotNull;

public class TestFileDescription extends DomFileDescription {
	public TestFileDescription() {
		super(Root.class, "root", "http://test.example/");
	}

	public Icon getFileIcon(int flags) {
		return AllIcons.FileTypes.Diagram;
	}

	@NotNull
	@Override
	public DomElement getResolveScope(final GenericDomValue reference) {
		return DomUtil.getFileElement(reference);
	}
}
