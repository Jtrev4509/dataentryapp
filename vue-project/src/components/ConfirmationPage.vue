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
    </div>
  </template>
  
  <script>
  import axios from 'axios';

  export default {
    props: ['user'],
    methods: {
      goBack() {
        this.$router.go(-1);
      }
    }
  }
  </script>
  
  <style scoped>
  .confirm-page {
    display: flex;
    justify-content: center;
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
  }
  
  button {
    margin-top: 20px;
    padding: 10px 20px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  
  button:hover {
    background-color: #0056b3;
  }
  </style>