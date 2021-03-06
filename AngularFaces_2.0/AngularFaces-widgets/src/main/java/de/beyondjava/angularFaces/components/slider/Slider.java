/*
 * Generated, Do Not Modify
 */
/*
 * Copyright 2009-2013 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.beyondjava.angularFaces.components.slider;

import javax.faces.application.ProjectStage;
import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PreRenderViewEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

import de.beyondjava.angularFaces.core.transformation.PuiAngularTransformer;

//@ResourceDependencies({ @ResourceDependency(library = "angularfaces-widgets", name = "slider/slider.css") })

@ResourceDependencies({
	@ResourceDependency(library="bsf", name="css/core.css", target="head"),
        @ResourceDependency(library="bsf", name="css/badges.css", target="head"),
        @ResourceDependency(library="bsf", name="css/jq.ui.core.css", target="head"),
        @ResourceDependency(library="bsf", name="css/jq.ui.theme.css", target="head"),
        @ResourceDependency(library="bsf", name="css/jq.ui.slider.css", target="head"),
        @ResourceDependency(library="bsf", name="css/bsf.css", target="head")
//        @ResourceDependency(library="bsf", name="jq/jquery.js", target="head"),
//        @ResourceDependency(library="bsf", name="jq/ui/core.js", target="body"),
//        @ResourceDependency(library="bsf", name="jq/ui/widget.js", target="body"),
//        @ResourceDependency(library="bsf", name="jq/ui/mouse.js", target="body"),
//        @ResourceDependency(library="bsf", name="jq/ui/slider.js", target="body")
})
@FacesComponent("de.beyondjava.angularFaces.components.slider")
public class Slider extends HtmlOutputText implements SystemEventListener, java.io.Serializable {

	public static final String COMPONENT_FAMILY = "de.beyondjava";
	private static final String DEFAULT_RENDERER = "de.beyondjava.angularFaces.components.slider";

	protected enum PropertyKeys {

		label, mode, min, max, step, orientation, handleShape, handleSize, value;

		String toString;

		PropertyKeys(String toString) {
			this.toString = toString;
		}

		PropertyKeys() {
		}

		public String toString() {
			return ((this.toString != null) ? this.toString : super.toString());
		}
	}

	public Slider() {
		setRendererType(DEFAULT_RENDERER);
		FacesContext context = FacesContext.getCurrentInstance();
		UIViewRoot root = context.getViewRoot();
		root.subscribeToViewEvent(PreRenderViewEvent.class, this);
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.label, null);
	}

	public void setLabel(java.lang.String _label) {
		getStateHelper().put(PropertyKeys.label, _label);
	}

	public java.lang.String getMode() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.mode, null);
	}

	public void setMode(java.lang.String _mode) {
		getStateHelper().put(PropertyKeys.mode, _mode);
	}

	public int getMin() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.min, null);
	}

	public void setMin(int _min) {
		getStateHelper().put(PropertyKeys.min, _min);
	}

	public int getMax() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.max, null);
	}

	public void setMax(int _max) {
		getStateHelper().put(PropertyKeys.max, _max);
	}

	public int getStep() {
		return (java.lang.Integer) getStateHelper().eval(PropertyKeys.step, null);
	}

	public void setStep(int _step) {
		getStateHelper().put(PropertyKeys.step, _step);
	}

	public java.lang.String getOrientation() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.orientation, null);
	}

	public void setOrientation(java.lang.String _orientation) {
		getStateHelper().put(PropertyKeys.orientation, _orientation);
	}

	public java.lang.String getHandleShape() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.handleShape, null);
	}

	public void setHandleShape(java.lang.String _handleShape) {
		getStateHelper().put(PropertyKeys.handleShape, _handleShape);
	}

	public java.lang.String getHandleSize() {
		return (java.lang.String) getStateHelper().eval(PropertyKeys.handleSize, null);
	}

	public void setHandleSize(java.lang.String _handleSize) {
		getStateHelper().put(PropertyKeys.handleSize, _handleSize);
	}

	public java.lang.String getValue() {
		Object v = getStateHelper().eval(PropertyKeys.value, null);
		if (v instanceof Integer) {
			return String.valueOf(v);
		}
		return (java.lang.String) v;
	}

	public void setValue(java.lang.String _value) {
		getStateHelper().put(PropertyKeys.value, _value);
	}

	public void processEvent(SystemEvent event) throws AbortProcessingException {
		Object source = event.getSource();
		if (source instanceof UIViewRoot) {
			long timer = System.nanoTime();

			final FacesContext context = FacesContext.getCurrentInstance();
			boolean isProduction = context.isProjectStage(ProjectStage.Production);
			addJavascript((UIViewRoot) source, context, isProduction);
		}
	}

	private void addJavascript(UIViewRoot root, FacesContext context, boolean isProduction) {
//		PuiAngularTransformer.addResourceAfterAngularJS("angularfaces-widgets", "slider/jquery-ui.js");
		PuiAngularTransformer.addResourceAfterAngularJS("angularfaces-widgets", "slider/slider.js");
	}

	@Override
	public boolean isListenerForSource(Object source) {
		if (source instanceof UIComponent) {
			return true;
		}
		return false;
	}

}