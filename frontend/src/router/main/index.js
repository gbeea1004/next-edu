import { lazyLoadView } from '@/router/lazyLoadView.js';

export const mainRoutes = [
  {
    // 메인
    path: '/main',
    name: 'main',
    component: lazyLoadView('main/Main')
  }
];