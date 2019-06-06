/*
 * Copyright (c) Elastic Path Software Inc., 2019
 */
package net.sjrx.plugin.scratch.dom;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.xml.ConvertContext;
import com.intellij.util.xml.Converter;
import com.intellij.util.xml.CustomReferenceConverter;
import com.intellij.util.xml.DomResolveConverter;
import com.intellij.util.xml.GenericDomValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * com.intellij.util.xml.DomReferencesTest
 */
public class ObjConverter extends DomResolveConverter<Obj> {

	public ObjConverter() {
		super(Obj.class);
	}
}
