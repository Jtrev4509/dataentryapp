<template>
    <div class="confirm-page">
      <div class="centered-content">
        <h2>Confirmation</h2>
        <p><strong>Name:</strong> {{ user.name }}</p>
        <p><strong>Age:</strong> {{ user.age }}</p>
        <p><strong>Title:</strong> {{ user.title }}</p>
        <p><strong>Hometown:</strong> {{ user.hometown }}</p>
        <button @click="goBack">Go Back</button>
      </div>
      <div>
    <table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Age</th>
          <th>Title</th>
          <th>Hometown</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.id">
          <td>{{ user.name }}</td>
          <td>{{ user.age }}</td>
          <td>{{ user.title }}</td>
          <td>{{ user.hometown }}</td>
        </tr>
      </tbody>
    </table>
  </div>
    </div>
  </template>
  
  <script>
  import axios from 'axios';

  export default {
    data() {
    return {
      users: [], 
    };
  },
  mounted() {
    this.fetchUsers();
  },
    props: ['user'],
    methods: {
      goBack() {
        this.$router.go(-1);
      },
      async fetchUsers() {
      try {
        const response = await axios.get('http://localhost:8080/usersList');
        this.users = response.data;
      } catch (error) {
        console.error('Error fetching users:', error);
      }
    },
    }
  }
  </script>
  
  <style scoped>
.confirm-page {
  display: flex;
  flex-direction: column;
  align-items: center;
  min-height: 100vh;
  font-family: Arial, sans-serif;
}

.centered-content {
  max-width: 400px;
  text-align: center;
  padding: 20px;
  border: 1px solid #ccc;
  background-color: #f9f9f9;
  border-radius: 5px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  margin-bottom: 20px;
}

.user-table {
  max-width: 600px;
  margin: 0 auto;
}

table {
  width: 100%;
  border-collapse: collapse;
  border: 1px solid #ccc;
}

th, td {
  padding: 8px;
  border: 1px solid #ccc;
  text-align: center;
}

button {
  margin-top: 20px;
  padding: 10px 20px;
  background-color: black;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: grey;
}
</style>