import axios from 'axios';

const baseUrl = '/api/courses';

async function fetchCourseList() {
  try {
    const response = await axios.get(`${baseUrl}`);
    return response;
  } catch (error) {
    console.log('fetchCourseList error -> ', error);
  }
}

export { fetchCourseList };
