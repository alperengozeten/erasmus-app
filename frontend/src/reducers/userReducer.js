import { GET_USER } from "../constants/actionTypes";


const INITIAL_STATE = {
  user: {
    /*
    type: 'Outgoing Student',
    name: 'John Doe',
    email: 'john@bilkent.edu.tr',
    studentInfo: {
      studentID: '21902131',
      semesterNo: 7,
      departmentName: 'Computer Science',
    },*/
  },
  application: {
    type: 'Erasmus',
    selectedUniversities: [],
    selectedSemester: 'fall',
    admittedUniversity: null,
    documents: [],
  },
  requests: [],
};

const userReducer = (state = INITIAL_STATE, action) => {
  switch (action.type) {
    case GET_USER: {
      return {...state, user: action.payload };
    }
    default:
      return state;
  }
};

export default userReducer;