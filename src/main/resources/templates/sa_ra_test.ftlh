<p>Global session attribute direct reference as parameter's @SessionAttribute anno value: ${(globalSessionAttr1)!'?'}</p>
<p>Global session attribute direct reference as @SessionAttribute-annotated parameter name: ${(globalSessionAttr2)!'?'}</p>
<p>Global session attribute added in interceptor (no reference in method): ${(globalSessionAttr3)!'?'}</p>
<p>Global sessions attributes got via method-level model attrs: ${(sa)!'?'}                </p>
<p>Request Attribute added via interceptor direct reference as parameter's @RequestAttribute anno value: ${(start_reqattr1)!'?'}             </p>
<p>Request Attribute added via interceptor direct reference as @RequestAttribute-annotated parameter name: ${(start_reqattr2)!'?'}             </p>
<p>Request Attribute added via interceptor (no references in method): ${(start_reqattr3)!'?'}             </p>
<p>Request Attribute added via interceptor got via model attr:${(ra)!'?'}             </p>
<p>Global model attribute added via interceptor: ${(duration)!'?'}             </p>
