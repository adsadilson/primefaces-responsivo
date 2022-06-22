package br.com.apssystem.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class MenuBean {

	public String getItemCssClass(String viewId) {
		FacesContext context = FacesContext.getCurrentInstance();
		String currentViewId = context.getViewRoot().getViewId();
		
		viewId = "/" + viewId + ".xhtml";
		
		return currentViewId.equals(viewId) ? "is-selected" : null;
	}
	
}