import React from 'react'
import "./App.css"
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import HomePage from './components/HomePage'

const App = () => {
  return (
    <div>
      <BrowserRouter>
      <Routes>
        <Route path='/' element = {<HomePage/>} />
      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App