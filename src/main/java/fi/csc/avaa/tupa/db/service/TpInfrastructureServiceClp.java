package fi.csc.avaa.tupa.db.service;

import com.liferay.portal.service.InvokableService;

/**
 * @author CSC
 * @generated
 */
public class TpInfrastructureServiceClp implements TpInfrastructureService {
    private InvokableService _invokableService;
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;

    public TpInfrastructureServiceClp(InvokableService invokableService) {
        _invokableService = invokableService;

        _methodName0 = "getBeanIdentifier";

        _methodParameterTypes0 = new String[] {  };

        _methodName1 = "setBeanIdentifier";

        _methodParameterTypes1 = new String[] { "java.lang.String" };

        _methodName3 = "getAllInfrastructures";

        _methodParameterTypes3 = new String[] {  };

        _methodName4 = "getInfrastructuresByInfrastructuresIds";

        _methodParameterTypes4 = new String[] { "int[][]" };

        _methodName5 = "getInfrastructuresByUrns";

        _methodParameterTypes5 = new String[] { "java.lang.String[][]" };

        _methodName6 = "getInfrastructuresByOrganisationIds";

        _methodParameterTypes6 = new String[] { "int[][]" };

        _methodName7 = "getInfrastructuresByServiceIds";

        _methodParameterTypes7 = new String[] { "int[][]" };

        _methodName8 = "getInfrastructuresByContactIds";

        _methodParameterTypes8 = new String[] { "int[][]" };

        _methodName9 = "getInfrastructuresByKeywords";

        _methodParameterTypes9 = new String[] { "java.lang.String[][]" };

        _methodName10 = "getInfrastructuresByServiceTypes";

        _methodParameterTypes10 = new String[] { "java.lang.String[][]" };

        _methodName11 = "getInfrastructuresByLocationTypes";

        _methodParameterTypes11 = new String[] { "java.lang.String[][]" };

        _methodName12 = "getInfrastructuresByPostalCodes";

        _methodParameterTypes12 = new String[] { "int[][]" };

        _methodName13 = "getInfrastructuresByLocation";

        _methodParameterTypes13 = new String[] { "double", "double" };

        _methodName14 = "getInfrastructuresByCountries";

        _methodParameterTypes14 = new String[] { "java.lang.String[][]" };

        _methodName15 = "getInfrastructuresByPreviousIds";

        _methodParameterTypes15 = new String[] { "int[][]" };

        _methodName16 = "getInfrastructuresByPreviousUrns";

        _methodParameterTypes16 = new String[] { "java.lang.String[][]" };

        _methodName17 = "getKeywords";

        _methodParameterTypes17 = new String[] {  };

        _methodName18 = "getPids";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "getInfrastructuresByPids";

        _methodParameterTypes19 = new String[] { "java.lang.String[][]" };
    }

    @Override
    public java.lang.String getBeanIdentifier() {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName0,
                    _methodParameterTypes0, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        try {
            _invokableService.invokeMethod(_methodName1,
                _methodParameterTypes1,
                new Object[] { ClpSerializer.translateInput(beanIdentifier) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getAllInfrastructures() {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName3,
                    _methodParameterTypes3, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByInfrastructuresIds(
        int[] infrastructuresIds) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName4,
                    _methodParameterTypes4,
                    new Object[] {
                        ClpSerializer.translateInput(infrastructuresIds)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByUrns(
        java.lang.String[] infrastructuresUrns) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName5,
                    _methodParameterTypes5,
                    new Object[] {
                        ClpSerializer.translateInput(infrastructuresUrns)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByOrganisationIds(
        int[] organisationsIds) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName6,
                    _methodParameterTypes6,
                    new Object[] { ClpSerializer.translateInput(
                            organisationsIds) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceIds(
        int[] servicesIds) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName7,
                    _methodParameterTypes7,
                    new Object[] { ClpSerializer.translateInput(servicesIds) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByContactIds(
        int[] contactIds) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName8,
                    _methodParameterTypes8,
                    new Object[] { ClpSerializer.translateInput(contactIds) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByKeywords(
        java.lang.String[] keywords) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName9,
                    _methodParameterTypes9,
                    new Object[] { ClpSerializer.translateInput(keywords) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByServiceTypes(
        java.lang.String[] serviceTypes) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName10,
                    _methodParameterTypes10,
                    new Object[] { ClpSerializer.translateInput(serviceTypes) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocationTypes(
        java.lang.String[] locationTypes) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName11,
                    _methodParameterTypes11,
                    new Object[] { ClpSerializer.translateInput(locationTypes) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPostalCodes(
        int[] PostalCodes) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName12,
                    _methodParameterTypes12,
                    new Object[] { ClpSerializer.translateInput(PostalCodes) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByLocation(
        double latitude, double longitude) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName13,
                    _methodParameterTypes13,
                    new Object[] { latitude, longitude });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByCountries(
        java.lang.String[] countries) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName14,
                    _methodParameterTypes14,
                    new Object[] { ClpSerializer.translateInput(countries) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousIds(
        int[] previousIds) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName15,
                    _methodParameterTypes15,
                    new Object[] { ClpSerializer.translateInput(previousIds) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPreviousUrns(
        java.lang.String[] previousUrns) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName16,
                    _methodParameterTypes16,
                    new Object[] { ClpSerializer.translateInput(previousUrns) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.lang.String[][] getKeywords() {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName17,
                    _methodParameterTypes17, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String[][]) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.lang.String[] getPids() {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName18,
                    _methodParameterTypes18, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String[]) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure> getInfrastructuresByPids(
        java.lang.String[] pids) {
        Object returnObj = null;

        try {
            returnObj = _invokableService.invokeMethod(_methodName19,
                    _methodParameterTypes19,
                    new Object[] { ClpSerializer.translateInput(pids) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<fi.csc.avaa.tupa.db.model.TpInfrastructure>) ClpSerializer.translateOutput(returnObj);
    }
}
