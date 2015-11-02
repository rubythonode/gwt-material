package gwt.material.design.client.ui;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import gwt.material.design.client.constants.WavesType;
import gwt.material.design.client.custom.ComplexWidget;
import gwt.material.design.client.custom.HasWaves;

import com.google.gwt.dom.client.Document;
import gwt.material.design.client.custom.mixin.WavesMixin;

//@formatter:off
/**
* Material Row is a container (needed to define) for every Component that implements HasGrid functionality.
* 
* <p>
* <h3>UiBinder Usage:</h3>
* <pre>
* {@code 
* <m:MaterialRow>
* 	<m:MaterialColumn grid='s12 m6 l6'/>
* 	<m:MaterialColumn grid='s12 m6 l6'/>
* </m:MaterialRow>
* }
* </pre>
* </p>
* 
* @author kevzlou7979
* @see <a href="http://gwt-material-demo.herokuapp.com/#grid">Material Column</a>
*/
//@formatter:on
public class MaterialRow extends ComplexWidget implements HasWaves {

	private final WavesMixin<MaterialRow> wavesMixin = new WavesMixin<>(this);

	public MaterialRow(){
		super(Document.get().createDivElement());
		setStyleName("row");
	}

	@Override
	public void setWaves(WavesType waves) {
		wavesMixin.setWaves(waves);
	}

	@Override
	public WavesType getWaves() {
		return wavesMixin.getWaves();
	}
}
