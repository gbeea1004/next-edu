export const lazyLoadView = view => () =>
  import(
    /* webpackChunkName: "pages-[request]" */
    `@/views/${view}.vue`
  );
