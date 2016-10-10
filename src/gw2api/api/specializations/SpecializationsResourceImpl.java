package gw2api.api.specializations;

import com.sun.jersey.api.client.WebResource;

import gw2api.util.rest.IdsResourceBase;

public class SpecializationsResourceImpl extends IdsResourceBase<Specialization, int[]> implements SpecializationsResource {
    public SpecializationsResourceImpl(WebResource webResource) {
        super(webResource.path("specializations"), Specialization.class, int[].class);
    }
}
