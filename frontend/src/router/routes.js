import { mainRoutes } from '@/router/main';

export const routes = [
  {
    path: '/',
    redirect: '/main'
  },
  // 메인 페이지
  ...mainRoutes
];
